import processing.core.PApplet;  //applet을 쓰겠다. documentation을 보자.
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Hello World!
 * 
 * This is the basic stub to start creating interactive maps.
 */
public class HelloUCSDWorld extends PApplet {

	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);//OPENGL 이 뭘까 만든 2차원 및 3차원 그래픽스 표준 API 규격으로, 프로그래밍 언어 간 플랫폼 간의 교차 응용 프로그래밍을 지원한다. 

		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());   //구글에서 제공해주는 맵을 쓰겠다.
		map.zoomAndPanTo(14, new Location(32.881, -117.238)); // UCSD 위도 경도이다.

		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		background(0);
		map.draw();
	}

}
