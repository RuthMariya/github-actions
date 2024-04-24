#!/bin/bash
# Name of the deployment
DEPLOYMENT_NAME="test-actions"

# Namespace of the deployment
NAMESPACE="ruth"

# Function to check the status of the deployment and pods
check_deployment_status() {
    echo "Checking status of deployment $DEPLOYMENT_NAME in namespace $NAMESPACE..."

    # Use oc to get the status of the deployment
    deployment_status=$(oc get deployment "$DEPLOYMENT_NAME" -n "$NAMESPACE" --no-headers)

    # Check if there was an error retrieving deployment status
    if [ $? -ne 0 ]; then
        echo "Error: Failed to retrieve deployment status."
        exit 1
    fi

    # Check if the deployment exists
    if [ -n "$deployment_status" ]; then
        echo "Deployment $DEPLOYMENT_NAME exists in namespace $NAMESPACE."
        echo "Deployment Status:"
        echo "$deployment_status"

        # Use the labels attached to the pods for querying
        label_selector="app.kubernetes.io/instance=$DEPLOYMENT_NAME,app.kubernetes.io/name=$DEPLOYMENT_NAME"

        # Use oc to get the pod status
        pod_status=$(oc get pods -l "$label_selector" -n "$NAMESPACE" --field-selector=status.phase=Running --no-headers)

        # Check if any pods are in the "Running" state
        if [ -n "$pod_status" ]; then
            echo "Pods for deployment $DEPLOYMENT_NAME are running:"
            echo "$pod_status"
        else
            echo "No pods for deployment $DEPLOYMENT_NAME are in the Running state."
        fi
    else
        echo "Deployment $DEPLOYMENT_NAME not found in namespace $NAMESPACE."
    fi
}

# Call the function to check deployment status
check_deployment_status
