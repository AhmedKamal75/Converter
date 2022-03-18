package code;


public class Test {

    String getValue(String Expression, String Variable){
        if (Expression.contains(Variable)){
            int start = Expression.indexOf("WITH " + Variable) + Variable.length() + 7;
            int stop = start;
            for (int i = start;i < Expression.length();i++){
                if (Expression.charAt(i) == '"') {
                    stop = i;
                    break;
                }
            }
            return Expression.substring(start, stop);
        } else
            return "";
    }
    String transform(String expression){
        String exp = "";
        if (expression.startsWith("ADD IMAGE")){
            exp = expression.replaceAll("ADD IMAGE", "<img").replaceAll("WITH SOURCE", "src=");
            exp = exp + " />";
        } else if (expression.startsWith("ADD HEADING")){
            exp = "<h1>";
            exp = exp + getValue(expression, "TEXT") + " </h1>";
        } else if (expression.startsWith("ADD PARAGRAPH")){
            exp = "<p";
            String style = "";
            if (expression.contains("WITH COLOR")){
                style = style + "color:" + getValue(expression, "COLOR") + ";";
            }
            if (expression.contains("WITH FONT")){
                style = style + "font-family:" + getValue(expression, "FONT") + ";";
            }
            if (style.length() > 0){
                exp = exp + " style=" + '"' + style + '"' + '>';
            }
            exp = exp + getValue(expression, "TEXT") + "</p>";
        } else if (expression.startsWith("ADD LINK")) {
            exp = "<a " + "href=" + '"' + getValue(expression, "LINK") + '"';
            String style = "";
            if (expression.contains("WITH COLOR")){
                style = style + "color:" + getValue(expression, "COLOR") + ";";
            }
            if (expression.contains("WITH FONT")){
                style = style + "font-family:" + getValue(expression, "FONT") + ";";
            }
            if (style.length() > 0){
                exp = exp + " style=" + '"' + style + '"';
            }
            exp = exp + ">" + getValue(expression, "TEXT") + "</p>";
        } else
            return "";
        return exp;
    }
}

