package net.dorianpb.cem.internal;

import net.dorianpb.cem.internal.cemStringParser.ParsedExpression;


/***/
public class stringtest{
    public static void main(String[] args){
        String yeet = "clamp(-0.5 * alex.rx, 0, 90)";
        ParsedExpression betelgeuse = cemStringParser.parse(yeet,null,null);
        System.out.println(betelgeuse.eval(0,0,0,0,0,null,null));
    }
}