# scala-lambda-minimal

I like to have a clean frame to work from so that I don't have to worry too much about some implementation details, so here is a very small Scala project meant to work as an AWS Lambda function. This is largely based on the [example given by AWS](https://aws.amazon.com/blogs/compute/writing-aws-lambda-functions-in-scala/).

All you have to do is to have Scala's SBT build tool installed and run: 

`sbt assembly`

Which will generate a fat jar file containing your function plus dependencies in the `target`folder. You can then upload this jar to the AWS Lambda console for creating/updating Lambda functions.
