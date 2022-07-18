node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'tclport'), string(name: 'DESCRIPTION', 'Tcl is a high-level, general-purpose, interpreted, dynamic programming language.' )]
        }
}
