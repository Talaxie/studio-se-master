
FOLDER=${1:-.}
TMP=zzz.txt

ls  "$FOLDER" > "$TMP"
sed -e s/'_\([[:digit:]]\+.\)\{3\}\(NB_\)\?[rvI]\?[[:digit:]]\{5,14\}\(-[[:digit:]]\)\?'//g "$TMP"

rm "$TMP"
