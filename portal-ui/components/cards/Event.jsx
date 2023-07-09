
function Event({ school, event }) {
    return (
        <div id='mainCardContainer' className='w-8/12 border-[1px] mx-auto rounded-md'>
            <div id='content' className='grid grid-cols-2 gap-3 p-3'>
                <div id='eventAnnouncement' className=''>
                    <div id='eventImageHeader' className='flex items-center mb-3 gap-3'>
                        <img src={school.logo} className='w-10 h-10' alt="school1" />
                        <div id='schoolLogoLabel' className='flex-grow'>
                            <span className='text-xs float-right text-gray-400'>{school.posted}</span>
                            <p className='font-extrabold text-lg'>{school.name}</p>
                            <p className='font-normal text-sm'>is organizing a new event</p>
                        </div>
                    </div>
                    <div id='eventImage' className="relative">
                        <img src={event.imageSrc} alt="event1" className='w-full rounded-sm' />
                        <div className='absolute w-full h-full z-10 top-0 element-with-radial-gradient' />
                    </div>
                </div>
                <div id='eventDescription' className='space-y-3'>
                    <p className='text-lg text-center font-bold tracking-widest font-mono uppercase'>{event.name}</p>
                    <p className='text-sm font-sans text-justify'>{event.desc}</p>
                    <div id='eventInfo' className='text-left text-sm font-bold font-mono'>
                        <table className='border-collapse border border-slate-500 w-full'>
                            <tr className=''>
                                <th className='border-collapse border border-slate-500'>Level</th>
                                <th className='border-collapse border border-slate-500 font-light text-sm'>{event.level}</th>
                            </tr>
                            <tr className=''>
                                <th className='border-collapse border border-slate-500 '>Certification</th>
                                <th className='border-collapse border border-slate-500 font-light text-sm'>{event.certification}</th>
                            </tr>
                            <tr className=''>
                                <th className='border-collapse border border-slate-500 '>Duration</th>
                                <th className='border-collapse border border-slate-500 font-light text-sm'>{event.startDate} - {event.endDate}</th>
                            </tr>
                            <tr className=''>
                                <th className='border-collapse border border-slate-500 '>Venue</th>
                                <th className='border-collapse border border-slate-500 font-light text-sm'>{event.location}</th>
                            </tr>
                            <tr className=''>
                                <th className='border-collapse border border-slate-500 '>Enrolment last date</th>
                                <th className='border-collapse border border-slate-500 font-light text-sm'>{event.enrolDate}</th>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div id='links' className='border-t-[1px] p-2 flex justify-evenly'>
                <a href="" className='text-xs'>enroll</a>
                <a href="" className='text-xs'>feedback</a>
                <a href="" className='text-xs'>contact</a>
            </div>
        </div >
    )
}

export default Event