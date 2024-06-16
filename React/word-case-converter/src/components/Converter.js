import { useState } from 'react';

export default function Converter() {
    const handleUpClick = () => {
        setText(text.toUpperCase());
    }

    const handleLoClick = () => {
        setText(text.toLowerCase());
    }

    const handleChange = (event) => {
        setText(event.target.value);
    }

    const [text, setText] = useState("Enter text here");

    return (
        <>
            <div className="mb-3">
                <textarea className="form-control" rows="6" value={text} onChange={handleChange}></textarea>
            </div >
            <button type="button" className="btn btn-primary my-3 mx-3" onClick={handleUpClick} >Convert to Uppercase</button>
            <button type="button" className="btn btn-primary my-3 mx-3" onClick={handleLoClick} >Convert to Lowercase</button>
        </>


    )
}
