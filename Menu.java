package cn.qiantongmuseum.pojo;

import java.util.List;

/**
 * @author Mr.Liang
 *2017年11月14日
 */
public class Menu {
	private Function function;
	private List<Function> functions;
	
	public Menu (){
		
	}
	
	
	public Menu(Function function) {
		super();
		this.function = function;
	}


	public Menu (List<Function> functions){
		this.functions = functions;
	}
	
	
	
	public Menu(Function function, List<Function> functions) {
		super();
		this.function = function;
		this.functions = functions;
	}


	public Function getFunction() {
		return function;
	}
	public void setFunction(Function function) {
		this.function = function;
	}
	public List<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
	
	
}
