package de.appwerft.vrview;

import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.titanium.proxy.TiViewProxy;

import com.google.vr.sdk.widgets.pano.VrPanoramaEventListener;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;
import com.google.vr.sdk.widgets.pano.VrPanoramaView.Options;

public class PanoramaView extends TiUIView {

    private VrPanoramaView panoWidgetView;

    public PanoramaView(TiViewProxy proxy) {
        super(proxy);
        panoWidgetView = new VrPanoramaView(proxy.getActivity());
        setNativeView(panoWidgetView);
    }

}