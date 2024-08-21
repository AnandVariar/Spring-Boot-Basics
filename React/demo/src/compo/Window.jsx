import React, { useEffect, useState } from 'react';

const Window = () => {
    const [windowSize, setWindowSize] = useState({
        width: window.innerWidth,
        height: window.innerHeight,
    });

    useEffect(() => {
        const updateSize = () => {
            setWindowSize({
                width: window.innerWidth,
                height: window.innerHeight,
            });
        };

        window.addEventListener('resize', updateSize);
        return () => {
            window.removeEventListener('resize', updateSize);
        };
    }, []);

    return (
        <div>
            <p>Width: {windowSize.width}</p>
            <p>Height: {windowSize.height}</p>
        </div>
    );
};

export default Window;
