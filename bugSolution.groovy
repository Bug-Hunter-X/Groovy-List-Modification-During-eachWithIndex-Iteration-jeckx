def list = [1, 2, 3, 4, 5]

def newList = []

list.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
    if (item != 3) {
        newList << item
    }
}

println newList