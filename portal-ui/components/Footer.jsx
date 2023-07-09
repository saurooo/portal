import React from 'react'

const Footer = () => {
    return (
        <div className='mt-3 px-3 bottom-0 bg-slate-100 text-sm text-gray-400 grid grid-cols-3 text-center'>
            <div className='space-x-3 hover:cursor-pointer'>
                <h1 className='p-2.5 font-bold text-lg text-gray-600'>docportal.in</h1>
                <a href="">twitter</a><a href="">facebook</a><a href="">LinkedIn</a></div>
            <div className='p-2 text-gray-600'>Copyright @ docportal Pvt. Ltd.</div>
            <div className='p-2 space-y-2 text-md hover:cursor-pointer'>
                <div className='w-fit mx-auto text-left'>
                    <a href="">Contact us</a>
                    <p>Privacy policy</p>
                    <p>Terms</p>
                    <p>Suggest</p>
                </div>
            </div>
        </div>
    )
}

export default Footer