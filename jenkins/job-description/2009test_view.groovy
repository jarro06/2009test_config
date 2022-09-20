 
listView('2009test Jobs') {
    description('2009test Jobs')
    jobs {
        regex('2009test_.+')
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
