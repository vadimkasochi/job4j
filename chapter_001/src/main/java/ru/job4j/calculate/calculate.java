/**
* Package for calculate task.
*
* @author Vadim Rylkov (inetitv@gmail.com)
* @version 1
* @since 0.1
*/
package ru.job4j.calculate;

public class calculate {
	public String Echo(String value) {
		return String.format("%s %s %s" , value, value, value);
	}
	/**
* main \
* @param args - args/
*/
	public static void main(String[] args) {
		calculate calc = new calculate();
		System.out.println(calc.echo("afaf"));
}
/**
 * Method echo.
 * @param name Your name.
 * @return Echo plus your name.
 */
 public String echo(String name) {
    return "Eho, echo, echo : " + name;
 }
}