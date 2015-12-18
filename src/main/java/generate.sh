function usage {
   echo "usage: ./generate.sh [-i <interface>] [-c <controller>] [-d <dao>] [-s <service>] [-o directory <output directory>] Entity_name" 
   exit
}

interface="class"
impl="Impl"
implcc="Impl"
request=""
package="implementations";
imports=""
directory="."

while getopts "icsdo:" opt; do
  case $opt in
    \?) usage;;
    i) echo "INTERFACE";
       interface="interface";
       package="interfaces";
       impl="";
       implcc="";;
    c) what="Controller";
       echo "controller";
       typ="Controller";
       low="controller";;
    d) what="DAO";
       echo "DAO";
       typ="Repository";
       low="dao";;
    s) what="Service";
       echo "Service";
       typ="Service";
       low="service";;
    o) directory=$OPTARG;
       mkdir -p $directory;;
  esac
done

shift $(($OPTIND - 1))
if [ $# -eq 0 ]
    then usage
fi

entity=$1
annotation="@$typ"
if [ $interface == "interface" ]
then
    annotation=""
fi

if [ $typ == "Controller" ]
then
    echo "WE ARE IN CONTROLLER";
    request="@RequestMapping(\"/${entity,,}\")";
    imports="import org.springframework.web.bind.annotation.*;";
    implcc=""
fi

if [[ ($typ == "Service") && ($interface != "interface") ]]
then
    need="implements $entity$what"
fi


echo "ENTITY $entity"

echo -e "package net.bonvio.$low.$package;

import net.bonvio.$low.generic.$package.Generic$what$impl;
import net.bonvio.model.$entity;
import org.springframework.stereotype.$typ;
$imports

/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

$annotation
$request
public $interface $entity$what$implcc extends Generic$what$impl<$entity> $need {}" > $directory/$entity$what$implcc.java
