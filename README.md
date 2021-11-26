# pdiot-app

## Model Description
Team D
26 November 2021

1 Capabilities and performance of the classifica- tion model
Here is a list of activities that your model can or cannot successfully classify: Three most confident activity our model can predict:
• Lying Down on stomach 86%
• Falling Down on Knees 89%
• Lying Down Right 83%
Our model fails on following activities:
• Sitting Bent Forward: misclassified as lying down on stomach • Sitting: misclassified as sitting bent backward
2 Evaluation
Here we provide accuracy, precision, recall and f-score for every activity: Overall accuracy, precision, recall and f-score
Test accuracy of the whole ResNet model : 0.64 Test accuracy of the whole ConvMix model : 0.65
Although the overall test accuracy is not very high, the individual class accuracies on the confusion matrix are very good, with most about 80%. The reason the overall accuracy suffers is because we did not do extensive data cleaning, and also some activities are easily misclassfied as others.
Accuracy is reported on unseen subjects with leave-one-out method in train- ing and testing. we do LOSOXV, which is testing the model on one left-out subject while training it on the rest of the available data, until all the subjects have been part of the test set at least once. And in this case, we will get the best estimate of your model’s performance in real time. We also test the real time accuracy as well.

Hyper-parameters for training and testing
• Batch size: For training, we use a batch size of 16 and for testing we use larger batch size 128.
• Optimizer and learning rate: SGD and Adam is used and learning rate is gradually decreased by a learning rate scheduler
• Choice of CNN model: ConvMix and ResNet 1D with 50 layers. Here is a screenshot of the training process:
Special Note
4
Table 1: Classification Report and Accuracy
Accuracy
0.042674 0.002845 0.556980 0.820257 0.645804 0.833803 0.856742 0.819464 0.274170 0.555878 0.423986 0.552632 0.280453 0.504237 0.893333 0.717391 0.652174 0.739130
of ResNet
1. Our submitted model is trained on all the available data, without complex noise filtering or exhaustive cleaning.
2. We prefer live data accuracy more than the static testing data accuracy. 3. For more live data accuracy, please see our video on Youtube:
• Video 1 • Video 2 • Video 3


## System Requirements:
Minimum SDK Version: 23
Target SDK Version: 30
Bluetooth Services enabled
WIFI enabled (for connecting to servers)
Minimal memory (Maximum memory usage of the app): 250MB Minimal storage (App size): 120MB
GPU specially optimized (support both CPU and GPU): using TensorFlow Lite NNAPI and GPU delegate Android version: 6-12 (Android 12 encouraged for Material UI design)
Hardware Requirements
Respeck or Thingy
Software Installation
You need to have Node.js and Amplify AWS installed to run this app.
You can download Node.js at this link here.
You can download Amplify AWS at this link here. Or by running these commands in your terminal: Mac:
$ sudo npm install -g @aws-amplify/cli
$ npx amplify-app --platform android
Windows
$ curl -sL https://aws-amplify.github.io/amplify-cli/install-win -o install.cmd && install.cmd
* Also make sure that your $PATH variable is pointing to the right place to access these resources.