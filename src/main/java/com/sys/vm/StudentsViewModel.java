package com.sys.vm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Window;

import com.sys.entity.Students;
import com.sys.repository.StudentsRepository;
import com.sys.services.StudentsService;

@Component
public class StudentsViewModel  extends SelectorComposer<Window> {

	 @Wire
	private Listbox studentListbox;
	
	  @WireVariable
	  private StudentsService studentservice;
	  
	  @WireVariable
	  private StudentsRepository repo;
	  
	  
	  @Override
	    @Init
	    public void doAfterCompose(Window comp) throws Exception {
	        super.doAfterCompose(comp);
	        
	        populateListbox();
	        
	    }
	  
	    private void populateListbox() { 
	    	
	    	        ArrayList<Students> list = new ArrayList();
	    	        list.add(new Students( 1L, "Kabera", "Ange"));
	    	        list.add(new Students( 2L, "Murangwa", "Thiery"));
	    	        list.add(new Students( 3L, "Sano", "Maurice"));
	    	        list.add(new Students( 4L, "Rukunfo", "John"));
	    	
						/*
						 * List<Students> students = studentservice.getAllEmployees();
						 */	    
	    	        
	           if (list != null) {	           
				
	        for (Students student : list) {
	            Listitem item = new Listitem();
	            item.appendChild(new Listcell(student.getId().toString()));
	            item.appendChild(new Listcell(student.getSd_fname().toString()));
	            item.appendChild(new Listcell(student.getSd_lname().toString()));
			    studentListbox.appendChild(item);

	        }
	           }
    }
	    
		
}