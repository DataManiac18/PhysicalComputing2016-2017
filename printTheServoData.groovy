
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins;
import eu.mihosoft.vrl.v3d.parametrics.*;
import com.neuronrobotics.bowlerstudio.creature.ICadGenerator;
import com.neuronrobotics.bowlerstudio.creature.CreatureLab;
import org.apache.commons.io.IOUtils;
import com.neuronrobotics.bowlerstudio.vitamins.*;
import javafx.scene.paint.Color;
import eu.mihosoft.vrl.v3d.Transform;
import com.neuronrobotics.bowlerstudio.physics.TransformFactory;

HashMap<String, Object>  vitaminData = Vitamins.getConfiguration( "hobbyServo","towerProMG91")

StringParameter servoSizeParam = new StringParameter("hobbyServo Default","towerProMG91",Vitamins.listVitaminSizes("hobbyServo"))

println vitaminData
double tipOfShaftToBottomOfFlange = vitaminData.get("tipOfShaftToBottomOfFlange")

println "Desired measurement:" + tipOfShaftToBottomOfFlange;


	