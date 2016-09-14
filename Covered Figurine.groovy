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
                       		.movez(35)
 //leg 1 of triangle man
 CSG leg1 = new Cylinder(5, // Radius at the bottom
                       		4, // Radius at the top
                       		35, // Height
                       		(int)30 //resolution
                       		).toCSG()//convert to CSG to display                    			         
                       		.movey(34)
                       		.movex(16)
 //leg 2 of triangle man
 CSG leg2 = new Cylinder(5, // Radius at the bottom
                       		5, // Radius at the top
                       		35, // Height
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
 CSG legs = legAndFoot1.union(legAndFoot2);

 //eye 1
 CSG eye1 = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(27)
				.movey(43)
				.movez(55)
//eye 2
  CSG eye2 = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(43)
				.movey(27)
				.movez(55)
//eye 3
  CSG eye3 = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(39)
				.movey(31)
				.movez(55)
//eye 4
  CSG eye4 = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(35)
				.movey(35)
				.movez(55)
//eye 5
  CSG eye5 = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(31)
				.movey(39)
				.movez(55)
//top eye
  CSG topEye = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(34)
				.movey(34)
				.movez(60)
//bottom eye
  CSG bottomEye = new Sphere(2)// Spheres radius
				.toCSG()
				.movex(36)
				.movey(36)
				.movez(50)
CSG eyes = eye1.union(eye2).union(eye3).union(eye4).union(eye5).union(topEye).union(bottomEye); 
eyes=eyes.setColor(javafx.scene.paint.Color.YELLOW);
//shoulder for one of the arms
CSG shoulder1 = new Cylinder(	12, // Radius at the bottom
                       		0, // Radius at the top
                       		30, // Height
                       		(int)4 //resolution
                       		).toCSG()//convert to CSG to display                    			 
shoulder1 = shoulder1 .rotz(50).roty(45).rotx(40).movey(31).movez(60).movex(19)
//shoulder for the other arm
CSG shoulder2 = new Cylinder(	12, // Radius at the bottom
                       		0, // Radius at the top
                       		30, // Height
                       		(int)4 //resolution
                       		).toCSG()//convert to CSG to display                    			 
shoulder2 = shoulder2 .rotz(-50).rotx(-40).roty(-45).movey(19).movez(60).movex(31)
CSG body = torso.union(legs).union(shoulder1).union(shoulder2).union(eyes)

CSG cover = new Cube(	100,// X dimention
					40,// Y dimention
					100//  Z dimention
					).toCSG()
body.setColor(javafx.scene.paint.Color.CYAN);
body=body.rotz(-45).movex(33).movey(-13.5);
return [body,measureWall]//,eyes] 
//y-35).rotx(-55).//use this for indented eyes: CSG finalBody = body.difference(eyes);
//add new aspect, bottle opener in back CSG bottleBack = new Cube

//CSG measureWall = new Cube(	100,// X dimention
//					100,// Y dimention
//					1//  Z dimention
//					).toCSG()movez(95)