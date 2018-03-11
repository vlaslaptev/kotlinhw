fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Hello world")
    } else {
        Speaker(args[0]).salute()
    }
}
