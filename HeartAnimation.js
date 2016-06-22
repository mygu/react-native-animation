/**
 * Created by mygu on 16/6/19.
 */

import React, {
    requireNativeComponent,
    PropTypes,
    View,
    Component
} from 'react-native';

class HeartAnimation extends Component {

    constructor(props, context) {
        super(props, context);
    }

    render() {
        const nativeProps = Object.assign({}, this.props);
        Object.assign(nativeProps, {});
        return (
            <RCTHeartAnimation
                {...nativeProps}
            />
        )
    }
}

LoveAnimation.propTypes = {
    started: PropTypes.bool,
    ...View.propTypes
};

const RCTHeartAnimation = requireNativeComponent('RCTHeartAnimation', HeartAnimation);

module.exports = HeartAnimation;