# spring-boot-2-ec2
A simple spring boot application that will be deployed to AWS EC2 instance by automataing using Github Actions (CI/CID)

# Outline of the Application
This Spring Boot application just exposes a single GET Rest API endpoint that receives two 
path variables as follows:

1. A case type (upper, lower, etc.)
2. A String value to be changed its case as specified in the first path variable

The pattern of the REST endpoint is as follows:

http://host:port/change/case/{caseType}/{val}

Following caseTypes are supported to change (Path variable is case-insensitive):
- ###### Upper 
- ###### Lower
- ###### Title
- ###### Sentence

Thus, to change case of the word **bKash Passthrough** to upperr case, please paste the following URL in your preferred browser's address bar:

http://host:port/change/case/upper/bKash%20Passthrough

This will produce the following result:

### BKASH PASSTHROUGH

We have following 2 profiles:
1. **dev**, running at port **8090**
2. **prod**, running at port **80**

**NOTE**: 
1. For CI/CD deployment, we choose active profile to be prod
2. The actual code for CI/CD is in 'develop' branch

# Preparing the CI/CD
Before we dive into detailed steps, for you here is a video, which is the motivation behind creating this Spring Boot project.

This video is the latest one, so don't judge it by its cover and the total numbers of viewers/likes/dislikes, etc.

<a href='https://www.youtube.com/watch?v=1-CKqngg6GY&t=1128s' target='_blank'>
    <img alt="Auto Deploy Spring Boot Project Using GitHub Actions to AWS EC2"
        height="400"
        src="https://raw.githubusercontent.com/mdaliazam/spring-boot-2-ec2/develop/auto-deploy-spring-boot-using-github-2-aws-ec2.png"
</a>

## Steps to launch an AWS EC2 instance 
TBD

## Steps to define CI/CD workflow using GitHub Action
TBD

## See it in action
Please click the link below to see the output of the application currently hosted in an AWS EC2 instance:

[http://ec2-3-145-203-93.us-east-2.compute.amazonaws.com/change/case/upper/bKash%20Passthrough](http://ec2-3-145-203-93.us-east-2.compute.amazonaws.com/change/case/upper/bKash%20Passthrough "REST endpoint output")

**NOTE**: This EC2 instance was being temporarily deployed and the output was as of February 17, 2022 and may not be available in the future.

**Thank you for reading**
