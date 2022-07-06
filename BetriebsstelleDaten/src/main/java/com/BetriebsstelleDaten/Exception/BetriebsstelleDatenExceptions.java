package com.BetriebsstelleDaten.Exception;


public class BetriebsstelleDatenExceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exceptionResponse
	 */
	public BetriebsstelleDatenExceptions(String exceptionResponse) {
        super(exceptionResponse);
    }
}
