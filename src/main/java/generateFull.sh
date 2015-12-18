function usage {
   echo "usage: ./generate.sh <-o directory> entity1 entity2 ..."
   exit
}

directory="."

while getopts "o:" opt; do
  case $opt in
    o) directory="$OPTARG";;
    \?) usage;;
  esac
done

shift $(($OPTIND - 1))
if [ $# -eq 0 ]
	then usage
fi

while [ "$2" != "" ]; do
  entity=$1
  ./generate.sh -c -o $directory/controller/implementations $entity
  ./generate.sh -d -o $directory/dao/implementations $entity
  ./generate.sh -d -i -o $directory/dao/interfaces $entity
  ./generate.sh -s -o $directory/service/implementations $entity
  ./generate.sh -s -i -o $directory/service/interfaces $entity
  echo " controller  implementations  $entity  generated"
  echo "    dao      implementations  $entity  generated"
  echo "    dao        interfaces     $entity  generated"
  echo "  service    implementations  $entity  generated"
  echo "  service      interfaces     $entity  generated"
  shift
done

