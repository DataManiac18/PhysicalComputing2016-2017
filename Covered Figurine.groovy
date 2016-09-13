//Your code here
CSG simpleSyntax =new Cylinder(10,10,40,(int)30).toCSG() // a one line Cylinder
//the torso of triangle man
CSG torso = new Cylinder(	30, // Radius at the bottom
                       		0, // Radius at the top
                       		60, // Height
                       		(int)4 //resolution
                       		).toCSG()//convert to CSG to display                    			 
                       		.movex(25)
                       		.movey(25)
                       		.movez(40)
 //leg 1 of triangle man
 CSG leg1 = new Cylinder(5, // Radius at the bottom
                       		4, // Radius at the top
                       		40, // Height
                       		(int)30 //resolution
                       		).toCSG()//convert to CSG to display                    			         
                       		.movey(34)
                       		.movex(16)
 //leg 2 of triangle man
 CSG leg2 = new Cylinder(5, // Radius at the bottom
                       		5, // Radius at the top
                       		40, // Height
                      		(int)30 //resolution
                      		).toCSG()//convert to CSG to display                    			        y 
                       		.movey(16)
                       		.movex(34)
 //foot 1 
 CSG foot1 = new Cylinder(	12, // Radius at the bottom
                       		0, // Radius at the top
                       		20, // Height
                       		(int)4 //resolution
                       		).toCSG()//convert to CSG to display                    			 
                       		.movex(16)
                       		.movey(34) 
 //foot 2                      		
 CSG foot2 = new Cylinder(	12, // Radius at the bottom
                       		0, // Radius at the top
                       		20, // Height
                       		(int)4 //resolution
                       		).toCSG()//convert to CSG to display                    			 
                      		.movex(34)
                       		.movey(16)   
                       		
 // perform leg unions
 CSG legAndFoot1 = leg1.union(foot1); 
 CSG legAndFoot2 = leg2.union(foot2); 
 
 
 
               		
  return [legAndFoot1,legAndFoot2 ,torso] 
 //Your code here 