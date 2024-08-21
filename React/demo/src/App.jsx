import { useState } from 'react'
import './App.css'
import Index from './Index'
import Amd from './compo/Amd'
import Window from './compo/Window'

function App() {
  const [count, setCount] = useState(0)

  const counts = () => {
    setCount(count+1)
  }

  return (
    <>
      <div>
        <p>{count}</p>
        <button onClick={counts}>Add</button>
       { /* <Index />
        <Amd />  */}
        <Window />
        </div>
    </>
  )
}

export default App
