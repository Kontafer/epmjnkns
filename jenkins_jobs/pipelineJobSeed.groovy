pipelineJob("sample-app-pipeline-job") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Kontafer/epmjnkns.git')
                        credentials('jenkins-github')
                    }
                    branch('testing')
                }
            }
            scriptPath("jenkins_jobs/pipelineJob.groovy")
        }
    }
}
