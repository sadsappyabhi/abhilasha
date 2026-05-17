#!/bin/bash

# Config
REGISTRY="registry.mocalabs.dev"
APP_REPO="mocalabs/abhilasha"
DB_REPO="mocalabs/abhilasha-db"
TAG="latest"

echo "WARNING: You must be logged in to the registry via 'docker login' for this script to run!"

read -p "Have you logged in with 'docker login'? (y/n) " IS_LOGGED_IN

if [[ "$IS_LOGGED_IN" == "y" || "$IS_LOGGED_IN" == "Y" ]]; then
  echo "Okay, if you say so. Proceeding ..."
else
  echo "Please use 'docker login' before running this script"
  exit 1
fi

echo "Building Application Image ..."
docker build --no-cache -t ${REGISTRY}/${APP_REPO}:${TAG} -f Dockerfile .
if [ $? -ne 0 ]; then
  echo "Application build failed!"
  exit 1
fi

echo "Pushing Application Image to Registry ..."
docker push ${REGISTRY}/${APP_REPO}:${TAG}
if [ $? -ne 0 ]; then
  echo "Failed to push Application Image to Registry!"
  exit 1
fi

echo "Successfully built and pushed image to registry!"