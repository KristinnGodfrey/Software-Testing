def test_low_pressure_activates_alarm():
    alarm = Alarm(sensor=StubSensor())
    alarm.check()
    assert alarm.is_alarm_on

    from alarm import Alarm
    from sensor import Sensor

    def test_alarm_is_off_by_default():
        alarm = Alarm()
        assert not alarm.is_alarm_on

    class StubSensor:
        def sample_pressure(self):
            return 15

    def test_low_pressure_activates_alarm():
        alarm = Alarm(sensor=StubSensor())
        alarm.check()
        assert alarm.is_alarm_on
