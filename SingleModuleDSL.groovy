job("Maven-Project-DSL") {
	description("Maven Job generated by the DSL on ${new Date()}, the project is a small sample hosted on github")
	scm {
		git("https://github.com/Roger2kTaylor/single-module.git", 'main')
            node / gitConfigName('Roger2kTaylor')
            node / gitConfigEmail('roger@skye-nets.com')
	}
	triggers {
		scm('* * * * *')
	}
	steps {
		maven('clean package', '//D:/Libraries/DevOps/03.Automation-Labs/MasterClass/single-module/pom.xml')
	}
	publishers {
		//archive the war file generated
		archiveArtifacts '**/*.jar'
	}
}