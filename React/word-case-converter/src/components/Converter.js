import { useState } from 'react';

export default function Converter() {
    const [text, setText] = useState("Enter text here");
    const [count, setCount] = useState(0);

    const handleUpClick = () => {
        setText(text.toUpperCase());
    }

    const handleLoClick = () => {
        setText(text.toLowerCase());
    }

    const handleCountClick = () => {
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
                    <textarea className="form-control" rows="6" value={text} onChange={handleChange}></textarea>
                </div >
                <button type="button" className="btn btn-primary my-3 mx-3" onClick={handleUpClick} >Convert to Uppercase</button>
                <button type="button" className="btn btn-primary my-3 mx-3" onClick={handleLoClick} >Convert to Lowercase</button>
                <button type="button" className="btn btn-primary my-3 mx-3" onClick={handleCountClick} >Word Count</button>
            </div>
            <div className="mb-3">
                <textarea className="form-control" rows="1" value={count} onChange={handleChange}></textarea>
            </div >
        </>


    )
}
