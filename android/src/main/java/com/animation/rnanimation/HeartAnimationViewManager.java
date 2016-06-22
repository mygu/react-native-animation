package com.animation.rnanimation;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Created by mygu on 16/6/20.
 */
public class HeartAnimationViewManager extends SimpleViewManager<PeriscopeLayout> implements LifecycleEventListener {

    public static final String REACT_CLASS = "RCTHeartAnimation";

    private RCTEventEmitter mEventEmitter;
    private ThemedReactContext reactContext;
    private PeriscopeLayout mPeriscopeLayout;
    private boolean started;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected PeriscopeLayout createViewInstance(ThemedReactContext reactContext) {
        this.reactContext = reactContext;
        mEventEmitter = reactContext.getJSModule(RCTEventEmitter.class);
        mPeriscopeLayout = new PeriscopeLayout(reactContext);
        reactContext.addLifecycleEventListener(this);

        return mPeriscopeLayout;
    }

    @ReactProp(name = "started")
    public void setStarted(PeriscopeLayout mPeriscopeLayout, boolean started) {
        this.started = started;
        if (started) {
            mPeriscopeLayout.addHeart();
        }
    }

    @Override
    public void onHostResume() {
    }

    @Override
    public void onHostPause() {
    }

    @Override
    public void onHostDestroy() {
    }
}
