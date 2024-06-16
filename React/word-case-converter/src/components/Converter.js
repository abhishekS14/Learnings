import { useState } from 'react';

export default function Converter() {
    const [text, setText] = useState("");
    const [count, setCount] = useState(0);
    const [showCount, setShowCount] = useState(true);

    const handleUpClick = () => {
        setText(text.toUpperCase());
    }

    const handleLoClick = () => {
        setText(text.toLowerCase());
    }

    const handleClearClick = () => {
        setText("");
    }

    const handleCountClick = () => {
        setShowCount(false);
        text.trim();
        if (text.length === 0) {
            setCount(0);
        } else {

            text.endsWith(" ") ? setCount(text.split(" ").length - 1) : setCount(text.split(" ").length);
        }
    }

    const handleChange = (event) => {
        setText(event.target.value);
    }


    return (
        <>
            <div>
                <div className="mb-3">
                    <textarea className="form-control" rows="6" value={text} onChange={handleChange} placeholder="Enter text here"></textarea>
                </div >
                <button type="button" className="btn btn-primary my-3 mx-1" onClick={handleUpClick} >Convert to Uppercase</button>
                <button type="button" className="btn btn-primary my-3 mx-1" onClick={handleLoClick} >Convert to Lowercase</button>
                <button type="button" className="btn btn-primary my-3 mx-1" onClick={handleCountClick} >Word Count</button>
                <button type="button" className="btn btn-primary my-3 mx-1" onClick={handleClearClick} >Clear</button>
            </div>
            <div className="mb-3 my-3 mx-3">
                <h3 hidden={showCount}>{count}</h3>
            </div >
        </>


    )
}
