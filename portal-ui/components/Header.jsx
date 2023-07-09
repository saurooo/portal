'use client'

import { useState } from "react"

const Header = () => {
    const [expanded, setExpanded] = useState(false)
    const toggleExpansion = () => {
        setExpanded((prev) => !prev)
        console.log(expanded)
    }

    return (
        <header className="sticky top-0 flex justify-between items-center p-3 border-b-[1px] bg-white z-50 mb-3">
            <p className="text-2xl font-bold text-slate-500">E-DOC</p>
            <nav className="">
                <ul className="flex flex-nowrap items-center gap-5 h-8">
                    <li className={`md:my-0 bg-gradient-to-r from-slate-700 to-slate-800 bg-no-repeat [background-position:50%_100%] [background-size:0%_10%] motion-safe:transition-all motion-safe:duration-200 hover:[background-size:100%_10%] focus:[background-size:100%_10%]`}><a href="">Home</a></li>
                    <li className={`md:my-0 bg-gradient-to-r from-slate-700 to-slate-800 bg-no-repeat [background-position:50%_100%] [background-size:0%_10%] motion-safe:transition-all motion-safe:duration-200 hover:[background-size:100%_10%] focus:[background-size:100%_10%]`}><a href="">My Events</a></li>
                    <li className={`md:my-0 bg-gradient-to-r from-slate-700 to-slate-800 bg-no-repeat [background-position:50%_100%] [background-size:0%_10%] motion-safe:transition-all motion-safe:duration-200 hover:[background-size:100%_10%] focus:[background-size:100%_10%]`}><a href="">Schools</a></li>
                    <li className={`md:my-0 bg-gradient-to-r from-slate-700 to-slate-800 bg-no-repeat [background-position:50%_100%] [background-size:0%_10%] motion-safe:transition-all motion-safe:duration-200 hover:[background-size:100%_10%] focus:[background-size:100%_10%]`}><a href="">Students</a></li>
                    <li className={`md:my-0 bg-gradient-to-r from-slate-700 to-slate-800 bg-no-repeat [background-position:50%_100%] [background-size:0%_10%] motion-safe:transition-all motion-safe:duration-200 hover:[background-size:100%_10%] focus:[background-size:100%_10%]`}><a href="">Transfers</a></li>
                </ul>
            </nav>
            <div className="flex gap-3 relative" onClick={toggleExpansion} onBlur={toggleExpansion}>
                <img src="assets/images/profile1.jpg" alt="profile.pic" className="w-10 h-10 rounded-full" />
                <ul value="" className={`bg-white border-[1px] rounded-sm absolute overflow-clip w-40 -right-56 -bottom-[11.5rem] z-40 transform duration-200 ${expanded ? "-translate-x-56" : ""}`}>
                    <li className="px-3 py-2 hover:bg-gray-200 transform duration-200">My Profile</li>
                    <li className="px-3 py-2 hover:bg-gray-200 transform duration-200">My Docs</li>
                    <li className="px-3 py-2 hover:bg-gray-200 transform duration-200">Change Password</li>
                    <li className="px-3 py-2 hover:bg-gray-200 transform duration-200">Sign Out</li>
                </ul>
            </div>
        </header>
    )
}

export default Header