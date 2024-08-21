import React from 'react'

function ReturnI() {
    return (
        <h2>Another Function</h2>
    )
}


const Amd = () => {
  return (
    <div>
        <h2>Amd</h2>
        <ReturnI />
        </div>
  )
}

export default Amd