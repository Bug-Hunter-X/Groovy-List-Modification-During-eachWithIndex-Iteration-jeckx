def list = [1, 2, 3, 4, 5]

println list.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
    if (item == 3) {
        list.remove(item)
    }
}

println list