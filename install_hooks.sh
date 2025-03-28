#!/bin/sh

cd .git/hooks
if [ ! -f pre-commit ]; then
  echo "Installing pre-commit hook in $(pwd)/."
  cat << 'EOF' > pre-commit

#!/bin/sh

echo "Executing scalafmt..."

sbt scalafmt

echo "scalafmt finished with code=$?"

EOF
  chmod u+x pre-commit
fi

