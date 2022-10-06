 
listView('MAILMAIL2 Jobs') {
    description('MAILMAIL2 Jobs')
    jobs {
        regex('MAILMAIL2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
