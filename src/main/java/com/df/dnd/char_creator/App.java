package com.df.dnd.char_creator;

import com.df.dnd.char_creator.views.CommandLineView;

public class App 
{
    public static void main( String[] args )
    {
    	
    	CommandLineView view = new CommandLineView();
		
    	view.createCharacterPrompt();
    
    }
}
