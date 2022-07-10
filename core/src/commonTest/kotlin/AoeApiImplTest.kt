import com.kshitijpatil.aoe2.NetModule
import com.kshitijpatil.aoe2.data.api.AoeApiImpl
import io.ktor.client.engine.cio.CIO
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class AoeApiImplTest {
    private val api = AoeApiImpl(NetModule.httpClient(CIO.create()))

    @Test
    fun `getAllCivilizations returns non empty list`() = runTest {
        val civilizations = api.getAllCivilizations()
        println(civilizations)
        assertTrue(civilizations.isNotEmpty())
    }
}
