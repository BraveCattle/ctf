.class public Lo/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lo/e;

.field public b:Lo/e;

.field public c:Lo/e;

.field public d:Lo/e;

.field public e:Lo/e;

.field public f:Lo/e;

.field public g:Lo/e;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/e;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lo/e;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo/c;->k:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/c;->p:Z

    iput-object p1, p0, Lo/c;->a:Lo/e;

    iput p2, p0, Lo/c;->o:I

    iput-boolean p3, p0, Lo/c;->p:Z

    return-void
.end method