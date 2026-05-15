#!/bin/bash

# Config
REGISTRY="registry.mocalabs.dev"
APP_REPO="mocalabs/abhilasha"
DB_REPO="mocalabs/abhilasha-db"
TAG="latest"

echo "Building Application Image ..."
docker build --no-cache -t ${REGISTRY}/${APP_REPO}:${TAG} -f Dockerfile .

echo "Building Database Image ..."
docker build --no-cache -t ${REGISTRY}/${DB_REPO}:${TAG} -f Dockerfile-db .

echo "Pushing Application Image to Registry ..."
docker push ${REGISTRY}/${APP_REPO}:${TAG}

echo "Pushing Database Image to Registry ..."
docker push ${REGISTRY}/${DB_REPO}:${TAG}