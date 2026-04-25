#!/bin/bash

# Config
APP_REPO="mocalabs/abhilasha"
DB_REPO="mocalabs/abhilasha-db"
TAG="latest"

echo "Building Application Image ..."
docker build --no-cache -t ${APP_REPO}:${TAG} -f Dockerfile .

echo "Building Database Image ..."
docker build --no-cache -t ${DB_REPO}:${TAG} -f Dockerfile-db .

echo "Pushing Application Image to Registry ..."
docker push ${APP_REPO}:${TAG}

echo "Pushing Database Image to Registry ..."
docker push ${DB_REPO}:${TAG}