import Event from "./cards/Event"

const EventList = () => {

    const school = {
        logo: 'assets/images/school1.jpg',
        name: 'Creative Global School',
        posted: 'posted 3 days ago'
    }

    const event = {
        name: 'Paint Shop',
        desc: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorum magnam in blanditiis neque, aliquam rerum magni animi esse eos harum porro id praesentium laudantium ab accusantium fugit minus autem dolores?',
        imageSrc: 'assets/images/event1.jpg',
        level: 'Interschool',
        certification: '2 star',
        startDate: '01-Aug-2023',
        endDate: '10-Aug-2023',
        location: 'Oyo Townhouse',
        enrolDate: '27-Jul-2023'
    }

    return (
        <div className="space-y-3">
            <Event school={school} event={event} />
            <Event school={school} event={event} />
            <Event school={school} event={event} />
            <Event school={school} event={event} />
            <Event school={school} event={event} />
        </div>
    )
}

export default EventList