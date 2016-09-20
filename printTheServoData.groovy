import com.neuronrobotics.bowlerstudio.vitamins.Vitamins;
import eu.mihosoft.vrl.v3d.parametrics.*;

HashMap<String, Object>  vitaminData = Vitamins.getConfiguration( "hobbyServo","towerProMG91")

println vitaminData
double tipOfShaftToBottomOfFlange = vitaminData.get("tipOfShaftToBottomOfFlange")

println "Desired measurement:" + tipOfShaftToBottomOfFlange