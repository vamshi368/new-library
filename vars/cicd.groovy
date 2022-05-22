def newgit(repo)
{
  git "${repo}"
}  
def newmaven()
  {
  sh 'mvn package'
  }
def newdeploy(ip,contextpath)
{
  sh "scp /home/ubuntu/.jenkins/workspace/declarativepipeline2/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}  
