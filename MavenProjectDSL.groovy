job ('First-Maven-Porject-Via_DSL')
{
description ("First Maven job generated by the DSL")
scm {
git("https://github.com/bahaaahmed2/maven_java_project.git","master")
}
triggers{
scm('* * * * *')
}
steps {
maven('clean package','pom.xml')
}
  publishers {
//archive the war file generated
archiveArtifacts '**/*.jar'
}
}
