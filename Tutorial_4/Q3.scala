object patterns extends App{
    def toUpper(name: String): String = {
      name.toUpperCase();
    }

    def toLower(name: String): String = {
      name.toLowerCase();
    }

    def firstTwoUpper(name: String): String = {
      name.substring(0,2).toUpperCase() + name.substring(2, name.length()).toLowerCase();
    }

    def firstlastUpper(name: String): String = {
      name.take(name.length()-1).capitalize + name.drop(name.length()-1).toUpperCase();
    }

    def formatNames(name: String)(function: String => String): String = {
      function(name);
    }

    println(formatNames("Benny")(toUpper(_)));
    println(formatNames("niroshan")(firstTwoUpper(_)));
    println(formatNames("Saman")(toLower(_)));
    println(formatNames("Kumara")(firstlastUpper(_)));
}
