#! /bin/sh
# Define the directory name
dir_name="bin"
log_dir_name="logs"

# Check if the directory exists
if [ -d "$dir_name" ]; then
    # Directory exists, clear its contents
    rm -rf "$dir_name"/*
    echo "Cleared contents of the directory: $dir_name"
else
    # Directory does not exist, create it
    mkdir "$dir_name"
    echo "Created the directory: $dir_name"
fi
if [ ! -d "$log_dir_name" ]; then
  mkdir "$log_dir_name"
  echo "Created logs folder"
fi

mvn clean install -DskipTests
cp ./target/initial-page-tests.jar ./bin/

