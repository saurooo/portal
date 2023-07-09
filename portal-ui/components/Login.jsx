import React from 'react'

const Login = () => {
    return (
        <div className='min-h-screen w-full flex flex-col justify-center items-center md:flex-row md:flex-nowrap gap-3 p-3'>
            <section className='w-full md:w-[55%] p-3'>
                <h1 className='ps-1 text-center text-4xl font-bold text-red-700 my-3'>E-Doc Portal</h1>
                <div className='md:w-[30rem] mx-auto'>
                    <p className='text-gray-500 font-bold p-3'>
                        The Portal provides an easy way for documents portability and offers a platform for students to showcase their skills.
                    </p>
                </div>
            </section>
            <section className='w-full md:w-[45%] p-3 md:p-0'>
                <div className='md:w-[30rem] p-5 rounded-lg box_shadow'>
                    <form className='grid grid-cols-1 gap-5'>
                        <div className='mb-2'>
                            <input type='text' className='w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500' placeholder='Username' />
                        </div>
                        <div>
                            <input type='password' className='w-full mb-2w-fit px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500' placeholder='Password' />
                        </div>
                        <div>
                            <button className='px-3 py-2 bg-indigo-600 mt-2 text-white shadow-lg rounded focus:outline-none active:scale-95 transform duration-200'>Login</button>
                            <button className='w-fit px-3 py-2 bg-rose-600 mt-2 text-white shadow-lg rounded focus:outline-none float-right active:scale-95 transform duration-200'>Create a Profile</button>
                        </div>
                        <div>
                            <a className='text-sm text-blue-500'>Forgot your password?</a>
                            <div className='border-2 mt-2' />
                        </div>
                    </form>
                </div>
            </section>
        </div>

    )
}

export default Login