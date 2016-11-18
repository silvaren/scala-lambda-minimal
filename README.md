# scala-lambda-minimal

I like to have a clean frame to work from so that I don't have to worry too much about some implementation details, so here is a very small Scala project meant to work as an AWS Lambda function. This is largely based on the [example given by AWS](https://aws.amazon.com/blogs/compute/writing-aws-lambda-functions-in-scala/).

All you have to do is to have Scala's SBT build tool installed and run: 

`sbt assembly`

Which will generate a fat jar file containing your function plus dependencies in the `target`folder. You can then upload this jar to the AWS Lambda console for creating/updating Lambda functions.

#### Deploying through SBT

You can use a [AWS Lambda SBT plugin](https://github.com/gilt/sbt-aws-lambda) to deploy your code to AWS Lambda. This requires use of the AWS S3 service to store the jar that will be deployed. If you'd prefer to directly upload your jar to AWS Lambda, I have written some changes on [a forked version of the plugin](https://github.com/silvaren/sbt-aws-lambda) that allows you to choose this deploy method.
