# AWS CDK Application

This is a blank project for an [AWS CDK][1] application that is using [aws-cdk-maven-plugin][2]. If 
you're new to AWS CDK, please refer to the [official developer guide][4]. Though the documentation uses 
`cdk` CLI, you should be able to use all the examples with the only difference that you use 
`aws-cdk-maven-plugin` instead of running the CLI commands like `cdk synth` or `cdk deploy` etc.

## Project Structure

* `src/main/java/com/myorg/ExampleApp` is entry-point of the CDK application. It's an instance of `App` 
construct and used as a root for the construct tree. In this example, it declares a single stack named 
`ExampleStack`.
* `src/main/java/com/myorg/ExampleStack` is a stack defining cloud resources.
* `cdk.context` is the JSON file defining the [runtime context][3] of the application.

## Usage

In order to synthesize a CloudFormation template for the stack defined in the scope of the application,
run `mvn package`. This will trigger `synth` goal of the plugin tied to the `package` phase.
```
mvn package
```
If the execution has completed successfully, you should be able to find a `cdk.out` directory in the 
`target` with a template for the `ExampleStack` in `ExampleStack.template.json`. As there're no resources
defined in the stack, the template is empty (`{}`).

To deploy the application to an AWS, run `mvn deploy`. 
```
mvn deploy
```
This will execute `bootstrap` and `deploy` goals (both associated with `deploy` phase). Since the stack is 
empty, the deployment will be skipped (you should see a corresponding message in the Maven output).


[1]: https://aws.amazon.com/cdk
[2]: https://github.com/LinguaRobot/aws-cdk-maven-plugin
[3]: https://docs.aws.amazon.com/cdk/latest/guide/context.html
[4]: https://docs.aws.amazon.com/cdk/latest/guide/home.html